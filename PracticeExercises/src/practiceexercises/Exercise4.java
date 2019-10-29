package practiceexercises;

public class Exercise4 {

    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[5];
        
        DataObject dataObject = new DataObject();
        
        dataObject.count = 6;
        dataObject.code = "Friday";
        dataObjects[0] = dataObject;
        
        dataObject = new DataObject();
        dataObject.count = 4;
        dataObject.code = "Friday";
        dataObjects[1] = dataObject;
        
        dataObject = new DataObject();
        dataObject.count = 9;
        dataObject.code = "Saturday";
        dataObjects[2] = dataObject;
        
        dataObject = new DataObject();
        dataObject.count = 1;
        dataObject.code = "Saturday";
        dataObjects[3] = dataObject;
        
        dataObject = new DataObject();
        dataObject.count = 5;
        dataObject.code = "Saturday";
        dataObjects[4] = dataObject;
        
        int sum = 0;
        
        for (int i = 0; i < dataObjects.length; i++){
            if("Friday".equals(dataObjects[i].code)){
                sum = sum + dataObjects[i].count;
            }
        }
        
        System.out.println("Sum: " + sum);
        
    }

}
