package CollectionFramework.Transient;

import java.io.*;

public class UtilClass {


    public static void serializeObject(String fileName, Object obj){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));) {
            oos.writeObject(obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Object deSerializeObject(String fileName){
        Object obj = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
            obj = ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}
