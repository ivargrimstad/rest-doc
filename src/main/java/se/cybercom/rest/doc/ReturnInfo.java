/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cybercom.rest.doc;


/**
 *
 * @author Peter Ivarsson Peter.Ivarsson@cybercom.com
 */
public class ReturnInfo {
   
   private String returnClassName;
   private String annotatedReturnType;
//   private List<FieldInfo> fields;

   public String getReturnClassName() {
      return returnClassName;
   }

   public void setReturnClassName( String returnClassName ) {
      this.returnClassName = returnClassName;
   }

   public String getAnnotatedReturnType() {
      return annotatedReturnType;
   }

   public void setAnnotatedReturnType( String annotatedReturnType ) {
      this.annotatedReturnType = annotatedReturnType;
   }

//   public List<FieldInfo> getFields() {
//      return fields;
//   }
//
//   public void setFields( List<FieldInfo> fields ) {
//      this.fields = fields;
//   }

}
