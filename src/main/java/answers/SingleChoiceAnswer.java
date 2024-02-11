package answers;

import answers.QuestionnaireAnswer;

public class SingleChoiceAnswer extends QuestionnaireAnswer {

    private final int answer;

    public SingleChoiceAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }

}
