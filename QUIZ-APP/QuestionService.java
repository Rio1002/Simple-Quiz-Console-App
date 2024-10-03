import java.util.Scanner;

public class QuestionService {
    Questions que[] = new Questions[5];
    int opt1[]={2,4,6,8};
    int opt2[]={2,4,6,8};
    int opt3[]={2,4,6,8};
    int opt4[]={2,4,6,8};
    int opt5[]={1,2,3,4};
    int a[] = new int[5];
    public QuestionService()
    {
        que[0]= new Questions(1, "size of int ",opt1 , 4);
        que[1]= new Questions(2, "size of long ",opt2 , 8);
        que[2]= new Questions(3, "size of double ",opt3 , 8);
        que[3]= new Questions(4, "size of char ",opt4 , 2);
        que[4]= new Questions(5, "size of boolean ",opt5 , 1);
    }
    void displayQustion()
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        for(Questions q: que)
        {
            System.out.println("Question No: "+q.getId());
            System.out.println(q.getQuestion());
            for(int x:q.getOpt())
                System.out.println(x);
            a[i] = sc.nextInt();
            i++;
        }
        sc.close();
    }
    void playQuiz()
    {
        int score = 0;
        System.out.println("Entered Answers are : ");
        for(int x:a)
            System.out.println(x);
        for(int i=0;i<5;i++)
        {
            if(a[i]==que[i].ans)
            {
                score++;
            }
        }
        System.out.println("Your score is : "+score);
    }
}
