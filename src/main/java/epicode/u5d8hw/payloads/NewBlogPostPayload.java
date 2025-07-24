package epicode.u5d8hw.payloads;

import jakarta.validation.constraints.*;
import lombok.Getter;

@Getter
public class NewBlogPostPayload {
    @Positive
    private int authorId;
    @NotBlank
    private String category;
    @NotBlank
    private String content;
    @Positive
    private double readingTime;
    @NotBlank
    private String title;
}
