package com.company;

import java.util.*;

public enum Some {

    QUEUE(new PriorityQueue<Element>()),
    LIST(new ArrayList<Element>()),
    SET(new HashSet<Element>()),
    DEQUE(new ArrayDeque<Element>());

    private Collection<Element> collection;

    Some(Collection<Element> collection) {
        this.collection = collection;
    }
}
