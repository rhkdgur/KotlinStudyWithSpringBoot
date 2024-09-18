package com.kotlin.udemy.auth.repository

import com.kotlin.udemy.auth.domain.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

/**
 *packageName    : com.kotlin.udemy.auth.repository
 * fileName       : UserRepository
 * author         : GAMJA
 * date           : 2024/09/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/09/17        GAMJA       최초 생성
 */
interface UserRepository:JpaRepository<UserEntity,Long>{
}