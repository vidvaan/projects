����   4 \  -com/krishnafirstprogram/Using_Methods_Scanner  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this /Lcom/krishnafirstprogram/Using_Methods_Scanner; sum1 (II)V	    java/lang/System   out Ljava/io/PrintStream;  java/lang/StringBuilder  Add : 
     (Ljava/lang/String;)V
      append (I)Ljava/lang/StringBuilder;
  " # $ toString ()Ljava/lang/String;
 & ( ' java/io/PrintStream )  println a I b sum2 ()F@�33@�  
  2  3 (F)Ljava/lang/StringBuilder; F main ([Ljava/lang/String;)V 8 java/util/Scanner	  : ; < in Ljava/io/InputStream;
 7 >  ? (Ljava/io/InputStream;)V A Enter num1 : 
 7 C D E nextInt ()I G Enter num2 : 
 7 I J . 	nextFloat L Sub : 
  	
  O  
  Q - . args [Ljava/lang/String; sc Ljava/util/Scanner; num1 num2 sub obj 
SourceFile Using_Methods_Scanner.java !               /     *� �    
                           [     � � Y� `� � !� %�    
   
      	                 * +     , +   - .     l     "/D0E� � Y� #$b� 1� !� %#$b�    
                      "       * 4    , 4  	 5 6     �     [� 7Y� 9� =L� @� %+� B=� F� %+� HF�%f8� � YK� � 1� !� %� Y� M:� N� PW�    
   .              %  +  B  K  T  Z      >    [ R S    P T U   C V +  % 6 W 4  + 0 X 4  K  Y    Z    [