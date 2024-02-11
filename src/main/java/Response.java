import java.util.Objects;

public class Response {

    private final Request request;
    private final int overallScore;

    public Request getRequest() {
        return request;
    }

    public int getOverallScore() {
        return overallScore;
    }
    public Response(Request request, int score) {
        this.request = request;
        this.overallScore = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return overallScore == response.overallScore && Objects.equals(request, response.request);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, overallScore);
    }
}
