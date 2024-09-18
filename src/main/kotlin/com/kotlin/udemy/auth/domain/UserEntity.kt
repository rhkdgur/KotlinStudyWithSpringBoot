package com.kotlin.udemy.auth.domain

import jakarta.persistence.*

/**
 *packageName    : com.kotlin.udemy.auth.user
 * fileName       : UserEntity
 * author         : GAMJA
 * date           : 2024/09/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/09/17        GAMJA       최초 생성
 */
@Entity
@Table(name = "user_info")
class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long?= null

    lateinit var userId : String

    lateinit var password : String

}