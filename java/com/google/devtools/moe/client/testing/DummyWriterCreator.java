/*
 * Copyright (c) 2011 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.moe.client.testing;

import com.google.devtools.moe.client.writer.WritingError;
import com.google.devtools.moe.client.writer.Writer;
import com.google.devtools.moe.client.writer.WriterCreator;

import java.util.Map;

/**
 *
 * @author dbentley@google.com (Daniel Bentley)
 */
public class DummyWriterCreator implements WriterCreator {

  private final String repositoryName;

  public DummyWriterCreator(String repositoryName) {
    this.repositoryName = repositoryName;
  }

  @Override
  public Writer create(Map<String, String> options) throws WritingError {
    return new DummyWriter(repositoryName);
  }
}
