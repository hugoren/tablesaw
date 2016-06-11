package com.github.lwhite1.tablesaw.util;

import it.unimi.dsi.fastutil.ints.IntComparator;

import javax.annotation.concurrent.Immutable;

/**
 * A Comparator for int primitives for sorting in reverse order, using the given comparator
 */
@Immutable
public final class ReversingIntComparator implements IntComparator {

  public static IntComparator reverse(IntComparator intComparator) {
    return new ReversingIntComparator(intComparator);
  }

  private final IntComparator intComparator;

  private ReversingIntComparator(IntComparator intComparator) {
    this.intComparator = intComparator;
  }

  @Override
  public int compare(int i, int i1) {
    return -intComparator.compare(i, i1);
  }

  @Override
  public int compare(Integer o1, Integer o2) {
    return -intComparator.compare(o1, o2);
  }
}
