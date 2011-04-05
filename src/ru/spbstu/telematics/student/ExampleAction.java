/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.spbstu.telematics.student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ExampleAction extends org.apache.struts.action.Action {

	private final static String SUCCESS = "success";

	/**
	 * This is the action called from the Struts framework.
	 * 
	 * @param mapping
	 *            The ActionMapping used to select this instance.
	 * @param form
	 *            The optional ActionForm bean for this request.
	 * @param request
	 *            The HTTP Request we are processing.
	 * @param response
	 *            The HTTP Response we are processing.
	 * @throws java.lang.Exception
	 * @return
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ExampleActionForm exampleForm = (ExampleActionForm) form;
		exampleForm.setMessage("Wow! It works!");
		
		return mapping.findForward(SUCCESS);
	}
}
