// $ANTLR : "Anasint2.g" -> "Anasint2.java"$

	package com.fgarmo.plgoto;
	import java.util.*;
	import java.io.ByteArrayOutputStream;
	import java.io.PrintStream;
	import antlr.*;

public interface Anasint2TokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int PROGRAM = 4;
	int MACRO = 5;
	int INSTRUCTIONS = 6;
	int LEFT_LABEL = 7;
	int DEFMACRO = 8;
	int ENDMACRO = 9;
	int ID = 10;
	int ASSIG = 11;
	int LSB = 12;
	int IF = 13;
	int GOTO = 14;
	int RSB = 15;
	int LOWER = 16;
	int GREATER = 17;
	int LOWEREQ = 18;
	int GREATEREQ = 19;
	int EQUAL = 20;
	int DISTINCT = 21;
	int PLUS = 22;
	int MINUS = 23;
	int NUMBER = 24;
}