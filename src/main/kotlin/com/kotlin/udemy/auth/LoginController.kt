package com.kotlin.udemy.auth

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 *packageName    : com.kotlin.udemy.auth
 * fileName       : LoginController
 * author         : rhkdg
 * date           : 2024-09-17
 * description    : 로그인 처리 컨트롤러
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-17        rhkdg       최초 생성
 */
@Controller
class LoginController {

    @GetMapping("sign")
    fun sign(model : Model) : String {
        return "sign";
    }

    @GetMapping("login")
    fun login(model : Model) : String {
        return "login";
    }
}