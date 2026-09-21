package com.bengj.cards.service;
import com.bengj.cards.dto.CardsDto;

public interface ICardsService {

    void createCard(String mobileNumber);

    CardsDto fetchCard(String mobileNumber);

    boolean updateCard(CardsDto CardsDto);

    boolean deleteCard(String mobileNumber);

}
