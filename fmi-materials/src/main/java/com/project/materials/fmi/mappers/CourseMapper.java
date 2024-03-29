package com.project.materials.fmi.mappers;


import com.project.materials.fmi.dtos.CourseDTO;
import com.project.materials.fmi.enums.Groups;
import com.project.materials.fmi.enums.MaterialType;
import com.project.materials.fmi.models.Course;

public class CourseMapper {
    public static CourseDTO toDTO(Course course) {
        if(course == null){
            return null;
        }
        CourseDTO dto = new CourseDTO();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setGroups(course.getGroup());
        return dto;
    }

    public static Course fromDTO(Course course, CourseDTO dto){
        if(course == null){
            return null;
        }
        if(dto == null){
            return null;
        }
        course.setName(dto.getName());
//        course.setMaterialType(MaterialType.Audio);
        course.setGroup(dto.getGroups());
        return course;
    }
}
