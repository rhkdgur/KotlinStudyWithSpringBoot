package com.kotlin.udemy.main

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 *packageName    : com.kotlin.udemy.main
 * fileName       : HomeController
 * author         : rhkdg
 * date           : 2024-09-17
 * description    : 메인 화면
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-17        rhkdg       최초 생성
 */
@Controller
class HomeController {

    @GetMapping("/")
    fun home(model : Model) : String {
        return "index";
    }
}