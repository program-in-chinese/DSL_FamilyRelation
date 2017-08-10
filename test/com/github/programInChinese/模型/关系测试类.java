package com.github.programInChinese.模型;

import static com.github.programInChinese.测试.断言.相等;

import java.util.Arrays;

import org.junit.Test;

public class 关系测试类 {

  @Test
  public void 简化关系() {
    相等(null, 关系类.简化关系(null));
    相等(null, 关系类.简化关系(Arrays.asList()));
    相等(关系类.爸爸, 关系类.简化关系(Arrays.asList(关系类.爸爸)));
    相等(关系类.爷爷, 关系类.简化关系(Arrays.asList(关系类.爸爸, 关系类.爸爸)));
    相等(关系类.大伯, 关系类.简化关系(Arrays.asList(关系类.爸爸, 关系类.哥哥)));
    相等(关系类.爷爷, 关系类.简化关系(Arrays.asList(关系类.爸爸, 关系类.哥哥, 关系类.爸爸)));
  }

}
