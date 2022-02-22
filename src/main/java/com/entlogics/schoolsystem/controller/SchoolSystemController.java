package com.entlogics.schoolsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * this controller class has methods to call dao methods to get list of all schools, get information of a school, get all classes of a school, get all students of a school,
 * get all subjects of a school, get all exams of a school, link the subjects to a school, edit a school, add a school, and delete a school
 */
@Controller
@RequestMapping("/schoolapi")
public class SchoolSystemController {

	// this method gets the list of all schools
	@RequestMapping("/schools")
	public void getAllSchools() {
		System.out.println("In School Controller, get list of all schools ");		
	}
	
	// this method gets information of a school
	@RequestMapping("/schools/{school_id}")
	public void getSchoolInformation(@PathVariable int school_id) {
		System.out.println("In School Controller, get information of a school with school id "+school_id);	
	}
	
	// this method gets the list of all classes of a school
	@RequestMapping("/schools/{school_id}/classes")
	public void getAllClassesOfASchool(@PathVariable int school_id) {
		System.out.println("In School Controller, get all classes of a school with school id "+school_id);
	}
	
	// this method gets the list of all students of a school
	@RequestMapping("/schools/{school_id}/students")
	public void getAllStudentsOfASchool(@PathVariable int school_id) {
		System.out.println("In School Controller, get all students of a school with school id "+school_id);	
	}
	
	// this method gets the list of all subjects of a school
	@RequestMapping("/schools/{school_id}/subjects")
	public void getAllSubjectsOfASchool(@PathVariable int school_id) {
		System.out.println("In School Controller, get all subjects of a school with school id "+school_id);	
	}
	
	// this method gets the list of all exams of a school
	@RequestMapping("/schools/{school_id}/exams")
	public void getAllExamsOfASchool(@PathVariable int school_id) {
		System.out.println("In School Controller, get all exams of a school with school id "+school_id);	
	}
	
	// this method shows a form for adding a new school
	@RequestMapping("/shownewform")
	public String showSchoolNewForm() {
		
		System.out.println("Inside school controller, show school new form");
		
		// return the form to add a new school
		return "show-add-form";
	}
	
	// this method shows a form for editing a school
	@RequestMapping("/showeditform")
	public String showSchoolEditForm() {
		System.out.println("Inside school controller, show school edit form");
		
		// returns the form to edit a school
		return "show-edit-form";
	}
	
	// this method shows a form for deleting a school
	@RequestMapping("/showdeleteform")
	public String showSchoolDeleteForm() {
		
		System.out.println("Inside school controller, show school delete form");
		
		// returns the form to delete a school
		return "show-delete-form";
	}
		
	// this method shows a form to links subjects to a school
	@RequestMapping("/link-subjects-to-school-form")
	public String linkSubjectsToASchool() {
		
		System.out.println("Inside school controller, link subjects to a school form");
		
		// returns the form to link the subjects to a school
		return "show-link-school-subjects";
	}
	
	// this method adds new school
//	@RequestMapping("/schools")
	public void addNewSchool() {
		System.out.println("In school Controller, add new School ");
	}
	
	// this method edits a school
//	@RequestMapping("/schools/{school_id}")
	public void editASchool(@PathVariable int school_id) {
		System.out.println("In School Controller, edit a school with school id "+school_id);
	}
	
	// this method links the subjects to a school
//	@RequestMapping("/schools/{school_id}/subjects")
	public void linkSubjectsToASchool(@PathVariable int school_id) {
		System.out.println("In School Controller, edit a school with school id "+school_id);
	}
	
	// this method deletes a school
//	@RequestMapping("/schools/{school_id}")
	public void deleteASchool(@PathVariable int school_id) {
		System.out.println("In School Controller, delete a school with school id "+school_id);		
	}
	
}
