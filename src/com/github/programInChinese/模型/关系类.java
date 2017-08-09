package com.github.programInChinese.模型;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public enum 关系类 {
  爸爸, 儿子, 爷爷, 哥哥, 大伯;

  private static HashMap<List<关系类>, 关系类> 简化关系表 = new HashMap<>();
  
  static {
    简化关系表.put(Arrays.asList(关系类.爸爸, 关系类.爸爸), 关系类.爷爷);
    简化关系表.put(Arrays.asList(关系类.爸爸, 关系类.哥哥), 关系类.大伯);
  }
  
  public static 关系类 简化关系(List<关系类> 关系链) {
    return 简化关系表.get(关系链);
  }
}
