����   = i  Controllers/serv_questions  javax/servlet/http/HttpServlet serialVersionUID J ConstantValue        <init> ()V Code
   
  LineNumberTable LocalVariableTable this LControllers/serv_questions; doGet R(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V 
Exceptions  javax/servlet/ServletException  java/io/IOException    &javax/servlet/http/HttpServletResponse   	getWriter ()Ljava/io/PrintWriter; ! Served at: 
 # % $ java/io/PrintWriter & ' append /(Ljava/lang/CharSequence;)Ljava/io/PrintWriter; ) + * %javax/servlet/http/HttpServletRequest , - getContextPath ()Ljava/lang/String; / 
beans/form
 .  2 form ) 4 5 6 getParameterValues '(Ljava/lang/String;)[Ljava/lang/String;
 8 : 9 java/lang/Integer ; < parseInt (Ljava/lang/String;)I
 . > ? @ 
setId_form (I)V ) B C D setAttribute '(Ljava/lang/String;Ljava/lang/Object;)V
  F G H getServletContext  ()Ljavax/servlet/ServletContext; J /question.jsp L N M javax/servlet/ServletContext O P getRequestDispatcher 5(Ljava/lang/String;)Ljavax/servlet/RequestDispatcher; R T S javax/servlet/RequestDispatcher U V forward @(Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;)V request 'Ljavax/servlet/http/HttpServletRequest; response (Ljavax/servlet/http/HttpServletResponse; f Lbeans/form; I dispat !Ljavax/servlet/RequestDispatcher; doPost
  b   
SourceFile serv_questions.java RuntimeVisibleAnnotations %Ljavax/servlet/annotation/WebServlet; value /serv_questions !                 
      3     *� �       
                                 �     R,�   � "+� ( � "W� .Y� 0N+1� 3 2� 76-� =+1-� A *� EI� K :+,� Q �       "         ! , " 2 $ ; % H & Q '    >    R       R W X    R Y Z   5 [ \  , & 2 ]  H 
 ^ _   `             I     *+,� a�       
    .  /                 W X     Y Z   c    d e     f  g[ s h