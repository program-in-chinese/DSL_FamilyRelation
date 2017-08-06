package com.github.programInChinese;
// Generated from 关系程序.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link 关系程序Parser}.
 */
public interface 关系程序Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link 关系程序Parser#程序}.
	 * @param ctx the parse tree
	 */
	void enter程序(关系程序Parser.程序Context ctx);
	/**
	 * Exit a parse tree produced by {@link 关系程序Parser#程序}.
	 * @param ctx the parse tree
	 */
	void exit程序(关系程序Parser.程序Context ctx);
	/**
	 * Enter a parse tree produced by {@link 关系程序Parser#声明}.
	 * @param ctx the parse tree
	 */
	void enter声明(关系程序Parser.声明Context ctx);
	/**
	 * Exit a parse tree produced by {@link 关系程序Parser#声明}.
	 * @param ctx the parse tree
	 */
	void exit声明(关系程序Parser.声明Context ctx);
	/**
	 * Enter a parse tree produced by {@link 关系程序Parser#问题}.
	 * @param ctx the parse tree
	 */
	void enter问题(关系程序Parser.问题Context ctx);
	/**
	 * Exit a parse tree produced by {@link 关系程序Parser#问题}.
	 * @param ctx the parse tree
	 */
	void exit问题(关系程序Parser.问题Context ctx);
	/**
	 * Enter a parse tree produced by {@link 关系程序Parser#人物}.
	 * @param ctx the parse tree
	 */
	void enter人物(关系程序Parser.人物Context ctx);
	/**
	 * Exit a parse tree produced by {@link 关系程序Parser#人物}.
	 * @param ctx the parse tree
	 */
	void exit人物(关系程序Parser.人物Context ctx);
}