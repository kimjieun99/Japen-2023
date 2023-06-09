package com.kimjieun99.replyboard03.controller;

import com.kimjieun99.replyboard03.dto.MemberDto;
import com.kimjieun99.replyboard03.service.MemberService;
import com.kimjieun99.replyboard03.utils.ScriptWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {

  @Autowired
  MemberService memberService;

  @GetMapping("/join")
  public String join(Model model) {
    model.addAttribute("memberDto", new MemberDto());
    return "/member/join";
  }

  @GetMapping("/login")
  public String login() {
    return "/member/login";
  }

  @GetMapping("/logout")
  public String logout(
    HttpServletRequest request,
    RedirectAttributes redirectAttributes
  ) {
    HttpSession session = request.getSession();
    session.removeAttribute("loggedMember");
    redirectAttributes.addFlashAttribute("msg", "로그아웃되었습니다.");
    return "redirect:/";
  }

  @GetMapping("/info")
  public String info() {
    return "/member/info";
  }

  @PostMapping("/loginProcess")
  public String loginProcess(
    MemberDto memberDto,
    RedirectAttributes redirectAttributes,
    HttpServletRequest request,
    HttpServletResponse response
  ) {
    MemberDto loggedMember = memberService.loginMember(memberDto);
    if (loggedMember == null) {
      return "redirect:/member/login";
    } else {
      HttpSession session = request.getSession();
      redirectAttributes.addFlashAttribute("msg", "로그인 되었습니다.");
      session.setAttribute("loggedMember", loggedMember);
      return "redirect:/";
    }
  }

  @PostMapping("/joinProcess")
  public String joinProcess(
    @Valid MemberDto memberDto,
    BindingResult bindingResult,
    Model model,
    RedirectAttributes redirectAttributes,
    HttpServletResponse response
  ) throws IOException {
    int result = memberService.insertMember(memberDto);
    if (bindingResult.hasErrors()) {
      return "/member/join";
    } else {
      if (result > 0) {
        return "redirect:/member/login";
      } else {
        ScriptWriter.alertAndBack(response, "다시 시도해 주세요");
        return null;
      }
    }
  }
}
