// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.io.IOException;

// Unfortunatly, I did not have time to start this portion of the challenge.
// I've never encountered/coded a parser before in any of my courses, and
// by the time I got to it, there was not enough time for me to attempt
// to teach it to myself. 
final class MyJSONParser implements JSONParser {

  @Override
  public JSON parse(String in) throws IOException {
    // TODO: implement this
    return new MyJSON();
  }
}
