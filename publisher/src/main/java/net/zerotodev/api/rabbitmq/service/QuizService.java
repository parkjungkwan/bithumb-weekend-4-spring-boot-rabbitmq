package net.zerotodev.api.rabbitmq.service;

import net.zerotodev.api.rabbitmq.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> creteQuiz();
}
