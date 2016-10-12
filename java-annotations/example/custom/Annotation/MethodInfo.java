package example.custom.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)

public @interface MethodInfo {

     String author() default "Satya";	
	 String date();
	 int revision() default 1;
	 String comments();
}

/*
 * Annotation method can't have parameters
 * 
 * Annotation methods return types are limited to primitives, String, enums, annotations
 * or array of these.
 * 
 * Annotations can have default values
 * 
 * Annotations can have meta annotations attached to them. Meta annotations are used to provide information about the annotation
 * 
 *      1. @Documented: indicates that elements using this annotation should 
 *      be documented by javadoc and similar tools. This type should be used 
 *      to annotate the declarations of types whose annotations affect the use 
 *      of annotated elements by their clients. If a type declaration is annotated with
 *       Documented, its annotations become part of the public API of the annotated elements.
 *      
 *      2.@Target – indicates the kinds of program element to which an annotation type is applicable. 
 *      Some possible values are TYPE, METHOD, CONSTRUCTOR, FIELD etc. If Target meta-annotation is
 *       not present, then annotation can be used on any program element.
 *      
 *      3. indicates that an annotation type is automatically inherited. If user queries the annotation type on a 
 *      class declaration, and the class declaration has no annotation for this type, then the class’s superclass 
 *      will automatically be queried for the annotation type. This process will be repeated until an annotation
 *      for this type is found, or the top of the class hierarchy (Object) is reached.
 *      
 *      4.@Retention – indicates how long annotations with the annotated type are to be retained. 
 *      It takes RetentionPolicy argument whose Possible values are SOURCE, CLASS and RUNTIME
 *      
 */
