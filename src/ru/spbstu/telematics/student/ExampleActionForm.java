/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.spbstu.telematics.student;

public class ExampleActionForm extends org.apache.struts.action.ActionForm {

    private String message;
   
    public ExampleActionForm() {
        super();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
