package com.secondpackage;

public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cats are the best";
    }
}
