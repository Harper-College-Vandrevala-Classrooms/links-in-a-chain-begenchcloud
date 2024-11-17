package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLinks {

  Links links;

  @BeforeEach
  void setUp() {
    links = new Links();
  }

  @Test
  void testAppendAndGet() {
    ChainLink linkOne = new ChainLink("red");
    links.append(linkOne);
    
    ChainLink retrievedLink = links.get(0);
    assertEquals("red", retrievedLink.color);
  }

  @Test
  void testMultipleAppends() {
    ChainLink linkOne = new ChainLink("red");
    ChainLink linkTwo = new ChainLink("blue");
    links.append(linkOne);
    links.append(linkTwo);

    ChainLink retrievedLinkOne = links.get(0);
    ChainLink retrievedLinkTwo = links.get(1);

    assertEquals("red", retrievedLinkOne.color);
    assertEquals("blue", retrievedLinkTwo.color);
  }

}
