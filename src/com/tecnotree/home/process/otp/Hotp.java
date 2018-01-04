/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tecnotree.home.process.otp;

public class Hotp extends Otp implements java.io.Serializable  {

  /**
   * Initialize an OTP instance with the shared secret generated on Registration process
   *
   * @param secret Shared secret
   * @param ticker Ticker responsible for retrieve the tick (either counter or time based)
   */
  public Hotp(String secret, Ticker ticker) {
    super(secret, ticker);
  }

  @Override
  public boolean verify(String otp) {
    return leftPadding(hash(secret, ((Counter) ticker).getCurrentTick())).equals(otp);
  }

  @Override
  protected OtpType getOtpType() {
    return OtpType.HOTP;
  }
}
