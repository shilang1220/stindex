/*
 * Copyright 2020 Yu Liebing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
package com.github.stdi_sys.stindex.dimension.bin;

import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;

public class BinValueTest {

  final double BIN_VALUE = 100;
  private final double DELTA = 1e-15;

  @Test
  public void testBinValue() {

    final int binIdValue = 2;
    final byte[] binID = ByteBuffer.allocate(4).putInt(binIdValue).array();

    final BinValue binValue = new BinValue(binID, BIN_VALUE);

    Assert.assertEquals(BIN_VALUE, binValue.getNormalizedValue(), DELTA);
  }
}
