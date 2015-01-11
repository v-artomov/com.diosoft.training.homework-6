import java.util.ArrayList;

/**
 * Created by Artomov on 19.12.2014.
 */

public class ArrayHelperResource {
    //
    // print Phone[] array:
    //
    public void println(ArrayList phones) {
        System.out.println(phones.toString());
    }
    //
    // returns merged leftArray and duplicates from (leftArray, rightArray):
    //
    //local code review (vtegza): use generic interfaces @ 1/11/2015
    public ArrayList merge(ArrayList leftArray, ArrayList rightArray) {
        ArrayList result = new ArrayList();
        result.add(leftArray);
        //local code review (vtegza): replace with foreach @ 1/11/2015
        for (int i = 0; i < leftArray.size(); i++)
            //local code review (vtegza): instead of iteration tou can use list.contains(element) @ 1/11/2015
            for (int j = 0; j < rightArray.size(); j++) {
                Object element = rightArray.get(j);
                if (element.equals(leftArray.get(i))) {
                    result.add(element);
                }
            }
        return result;
    }
}
