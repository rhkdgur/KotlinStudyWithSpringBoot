package com.kotlin.udemy.auth

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

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
    @GetMapping("/{moveUrl}")
    fun moveUrl(model : Model, @PathVariable("moveUrl") url : String) : String {
        return url;
    }
}