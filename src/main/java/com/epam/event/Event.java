package com.epam.event;

import java.io.Serializable;

public interface Event extends Serializable {

    void process();

}