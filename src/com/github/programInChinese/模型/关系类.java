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
    简化关系表.put(Arrays.asList(关系类.大伯, 关系类.爸爸), 关系类.爷爷);
  }
  
  /**
   * @param 关系链 所有都不是null
   * @return 简化后的关系
   */
  public static 关系类 简化关系(List<关系类> 关系链) {
    if (关系链 == null || 关系链.isEmpty()) {
      return null;
    } else if (关系链.size() == 1) {
      return 关系链.get(0);
    } else {
      关系类 关系 = 关系链.get(0);
      for (int i = 1; i < 关系链.size(); i++) {
        关系 = 简化关系表.get(Arrays.asList(关系, 关系链.get(i)));
        if (关系 == null) {
          return null;
        }
      }
      return 关系;
    }
  }
}
