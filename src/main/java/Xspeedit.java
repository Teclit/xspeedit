import java.util.ArrayList;
import java.util.stream.Collectors;

public class Xspeedit {

    static ArrayList<String> sArticles =new ArrayList<String>();//Creating arraylist 

    public String packageArticles(String articles) {
    
        char[] article = articles.toCharArray();
        // declaring an array with the size of chartter
        int[] arr = new int[article.length]; 
        // char object and storing that integer into the int a=char -'0'
        for (int i = 0; i < article.length; i++) {
            arr[i] = article[i] - '0';
        }

        getSumOfArrayList(arr);
        articles =  arrayListToStringChange();
        return articles;

    }

    /**
     * separate the array by sum of 10/
     * @param arr
     */
    public void  getSumOfArrayList(int[] arr){
        int sum = 0;
        int x=0;
        int y=0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
            if(sum==10 && i==arr.length-1){
                x=y;
                y=i+1;
                addSeparateValue(x, y, arr);
                sum=0;
            }else if(sum==10){
                y=i+1;
                addSeparateValue(x, y, arr);
                sum=0;
            
            }else if(sum<10 && i==arr.length-1){
                x=y;
                y=i+1;
                addSeparateValue(x, y, arr);
                sum=0;
            }else{
                int tsum = 0;
                tsum = sum + arr[i+1];
                if(tsum > 10){
                    tsum = 0;
                    x=y;
                    y=i+1;
                    addSeparateValue(x, y, arr);
                    sum=0;
                }
            }
        }

    }


    /**
     * add seperator to the array list and add to static variable
     * @param x
     * @param y
     * @param arr
     */
    public void addSeparateValue(int x, int y,  int[] arr){
        ArrayList<String> sArticle =new ArrayList<String>(); 
            for (int i=x; i<y; i++) {
                sArticle.add(Integer.toString(arr[i]));
            }
            sArticle.add("/");
        sArticles.addAll(sArticle);
    }


    /**
     * return the final result
     * @return String
     */
    public String arrayListToStringChange(){
        String astring = sArticles.stream().map(Object::toString).collect(Collectors.joining(""));
        astring = astring.substring(0, astring.length() - 1);
        return astring;
    }
  
}
