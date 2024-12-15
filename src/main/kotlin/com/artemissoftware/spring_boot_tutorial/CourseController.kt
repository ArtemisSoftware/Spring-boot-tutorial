package com.artemissoftware.spring_boot_tutorial

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CourseController()
{
    private var courses: List<Course> = listOf(
        Course(1, "Learn AWS", "THe guy"),
        Course(2, "Learn Kotlin", "THe other guy")
    )

    @RequestMapping("/courses")
    fun retrieveAllCourses(): List<Course> {
        return courses
    }
}