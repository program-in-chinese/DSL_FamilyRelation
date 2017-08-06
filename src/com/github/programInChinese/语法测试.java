package com.github.programInChinese;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class 语法测试 {

  public static void main(String[] args) throws IOException {
    ANTLRInputStream 输入 = new ANTLRInputStream(System.in);

    关系程序Lexer lexer = new 关系程序Lexer(输入);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    关系程序Parser parser = new 关系程序Parser(tokens);

    ParseTree 树 = parser.程序();

    System.out.println(树.toStringTree(parser));
  }

}
