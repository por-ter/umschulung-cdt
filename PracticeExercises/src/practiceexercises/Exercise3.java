package practiceexercises;

public class Exercise3 {

    public static void main(String[] args) {
        
        DataObject[] dataObjects = new DataObject[3];
        
        DataObject dataObject = new DataObject();
        
        dataObject.count = 6;
        dataObjects[0] = dataObject;
        
        dataObject = new DataObject();
        dataObject.count = 4;
        dataObjects[1] = dataObject;
        
        dataObject = new DataObject();
        dataObject.count = 9;
        dataObjects[2] = dataObject;
        
        int sum = 0;
        
        for (int i=0; i < dataObjects.length; i++){
            sum = sum + dataObjects[i].count;
        }
        
        System.out.println("Sum: " + sum);
        
    }

}
