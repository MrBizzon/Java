/* 
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя 
StringBuilder. Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр 
не должен попадать в запрос. Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", 
"age":"null"}
то есть должно получиться что-то вроде:
... where name = Ivanov and country = Russia and city = Moscow
*/

import java.util.Map;

public class Task_5 {

    public static StringBuilder getCondition(Map<String, String> params) {
      StringBuilder stringBuilder = new StringBuilder();
      for (Map.Entry<String, String> entry : params.entrySet()) {
        if (entry.getValue() != null) {
          if (stringBuilder.toString().equals("")) {
            stringBuilder.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
          } else {
            stringBuilder.append(" and ").append(entry.getKey()).append(" = '")
                .append(entry.getValue()).append("'");
          }
        }
  
      }
      return stringBuilder;
    }
  }