package com.storage.requests;

import com.storage.entities.Client;

public record CreateClientInput(String first_name, String last_name, String mobile) {
    public Client toClient() {
        Client client = new Client();

        client.setFirstName(first_name)
            .setLastName(last_name)
            .setMobile(mobile);

        return client;
    }
}
