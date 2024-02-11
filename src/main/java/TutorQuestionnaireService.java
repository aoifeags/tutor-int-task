import answers.MultipleChoiceAnswer;
import answers.SingleChoiceAnswer;

public class TutorQuestionnaireService {

    private final int[] MultipleChoiceScores = new int[] {1, 1, 1, 0};
    private final int[] SingleChoiceScores = new int[] {0, 1, 2, 0};

    public Response handleQuestionnaire(Request request) throws Exception {

        if (request == null){
            String message= "Request body cannot be null.";
            throw new Exception(message);
        }

        int overallScore = 0;

        overallScore += calculateMultipleChoice(request.getMultipleChoiceAnswer());
        overallScore += calculateSingleChoice(request.getSingleChoiceAnswer());

        return new Response(request, overallScore);
    }
    private int calculateMultipleChoice(MultipleChoiceAnswer multipleChoiceAnswer) {
        if (multipleChoiceAnswer == null) {
            return 0;
        }

        int[] answers = multipleChoiceAnswer.getAnswers();

        int score = 0;

        for (int answer : answers){
          score += getMultipleChoiceScoreForIndex(answer);
        }
        return score;
    }

    private int getMultipleChoiceScoreForIndex(int index){
        return MultipleChoiceScores[index];
    }

    private int calculateSingleChoice(SingleChoiceAnswer singleChoiceAnswer){

        if (singleChoiceAnswer == null) {
            return 0;
        }

        int answer = singleChoiceAnswer.getAnswer();

        int score = 0;

        score += getSingleChoiceScoreForIndex(answer);

        return score;
    }

    private int getSingleChoiceScoreForIndex(int index){
        return SingleChoiceScores[index];
    }
}
