import answers.MultipleChoiceAnswer;
import answers.SingleChoiceAnswer;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        TutorQuestionnaireService tutorQuestionnaireService = new TutorQuestionnaireService();
        String tutorId = UUID.randomUUID().toString();
        Request exampleRequest = new Request(
                "May Lena",
                tutorId,
                new MultipleChoiceAnswer(new int[] {3, 1}),
                new SingleChoiceAnswer(2)
        );
        try {
            Response result = tutorQuestionnaireService.handleQuestionnaire(exampleRequest);
            String message = String.format(" Tutor name: %s \n Tutor id: %s \n Tutor score: %s",
                    result.getRequest().getTutorName(),
                    result.getRequest().getTutorId(),
                    result.getOverallScore());
            System.out.println(message);}
        catch (Exception e){
            System.out.println("Not a valid request");
        }

    }
}