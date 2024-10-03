import java.util.Arrays;

public class Questions {
    int id;
    String question;
    int opt[] = new int[4];
    int ans;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public int[] getOpt() {
        return opt;
    }
    public Questions(int id, String question, int[] opt, int ans) {
        this.id = id;
        this.question = question;
        this.opt = opt;
        this.ans = ans;
    }
    public void setOpt(int[] opt) {
        this.opt = opt;
    }
    public int getAns() {
        return ans;
    }
    public void setAns(int ans) {
        this.ans = ans;
    }
    @Override
    public String toString() {
        return "Questions [id=" + id + ", question=" + question + ", opt=" + Arrays.toString(opt) + ", ans=" + ans
                + "]";
    }
    
}
