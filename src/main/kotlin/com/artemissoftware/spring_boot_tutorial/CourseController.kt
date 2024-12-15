package com.artemissoftware.spring_boot_tutorial

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CourseController()
{
    private val courses: List<Course> = listOf(
        Course(1, "Learn AWS", "THe guy"),
        Course(2, "Learn Kotlin", "THe other guy"),
        Course(3, "Learn Java", "THe same guy"),
        Course(4, "Learn C#", "THe same guy")
    )

    @RequestMapping("/courses")
    fun retrieveAllCourses(): List<Course> {
        return courses
    }
}