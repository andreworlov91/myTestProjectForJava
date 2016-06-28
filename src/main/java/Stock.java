import java.io.File;
import java.util.*;
import java.io.*;
public class Stock {

    public static void main(String[] args) {

        String c = null;
        try {
            File file = new File("src/main/java/text");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);

            }
            fileReader.close();
            c = stringBuffer.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Integer> list=new ArrayList<Integer>();

        for (int i=0;i<c.length();i++) {
            list.add(Integer.parseInt(c.substring(i,i+1)));

        }

        // Создаем список
        ArrayList<Entity> entity = new ArrayList<Entity>();

        // Наполняем список элементами
        for (int i=0; i<list.size(); i=i+2)
            entity.add(new Entity(list.get(i), list.get(i+1)));

        // На основе этого списка, создаем экземлпяр этого списка для сравнения
        ArrayList<Entity> compareEntity = entity;

        ext: // Метка для выхода, когда нашли пару
        for (int i = 0; i < entity.size(); i++) {
            for (int j = 0; j < compareEntity.size();
                 j++) {
                // Сравнивем элементы по-очередно и выводим результат
                if (entity.get(i).getEntityId() == compareEntity.get(j).getEntiityIdRef() &&
                        entity.get(i).getEntiityIdRef() == compareEntity.get(j).getEntityId()) {
                    System.out.println(entity.get(i).getEntityId() + " " + entity.get(i).getEntiityIdRef() + " " +
                            entity.get(i).getEntityId());
                    i++; // Нашли, прирастили индекс
                    continue ext; // Выходим на внешний цикл
                }
            }
        }
    }
}
