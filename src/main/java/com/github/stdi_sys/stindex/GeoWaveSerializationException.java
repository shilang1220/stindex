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
package com.github.stdi_sys.stindex;

public class GeoWaveSerializationException extends RuntimeException {
  private static final long serialVersionUID = 7302723488358974170L;

  public GeoWaveSerializationException(final String message) {
    super(message);
  }

  public GeoWaveSerializationException(final Throwable cause) {
    super(cause);
  }

  public GeoWaveSerializationException(final String message, final Throwable cause) {
    super(message, cause);
  }

}
