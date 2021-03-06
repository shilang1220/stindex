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
package com.github.stdi_sys.stindex.simple;

import com.github.stdi_sys.stindex.dimension.NumericDimensionDefinition;
import com.github.stdi_sys.stindex.lexicoder.Lexicoders;

/**
 * A simple 1-dimensional NumericIndexStrategy that represents an index of signed long values. The
 * strategy doesn't use any binning. The ids are simply the byte arrays of the value. This index
 * strategy will not perform well for inserting ranges because there will be too much replication of
 * data.
 */
public class SimpleLongIndexStrategy extends SimpleNumericIndexStrategy<Long> {

  public SimpleLongIndexStrategy() {
    super(Lexicoders.LONG);
  }

  public SimpleLongIndexStrategy(final NumericDimensionDefinition definition) {
    super(Lexicoders.LONG, new NumericDimensionDefinition[] {definition});
  }

  @Override
  protected Long cast(final double value) {
    return (long) value;
  }

  @Override
  protected boolean isInteger() {
    return true;
  }
}
