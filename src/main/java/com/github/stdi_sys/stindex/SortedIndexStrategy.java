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

/** Interface which defines an index strategy. */
public interface SortedIndexStrategy<QueryRangeType extends IndexConstraints, EntryRangeType>
    extends
    IndexStrategy {
  /**
   * Returns a list of query ranges for an specified numeric range.
   *
   * @param indexedRange defines the numeric range for the query
   * @return a List of query ranges
   */
  public QueryRanges getQueryRanges(QueryRangeType indexedRange, IndexMetaData... hints);

  /**
   * Returns a list of query ranges for an specified numeric range.
   *
   * @param indexedRange defines the numeric range for the query
   * @param maxRangeDecomposition the maximum number of ranges provided by a single query
   *        decomposition, this is a best attempt and not a guarantee
   * @return a List of query ranges
   */
  public QueryRanges getQueryRanges(
          QueryRangeType indexedRange,
          int maxEstimatedRangeDecomposition,
          IndexMetaData... hints);

  /**
   * Returns a list of id's for insertion. The index strategy will use a reasonable default for the
   * maximum duplication of insertion IDs
   *
   * @param indexedData defines the numeric data to be indexed
   * @return a List of insertion ID's
   */
  public InsertionIds getInsertionIds(EntryRangeType indexedData);

  /**
   * Returns a list of id's for insertion.
   *
   * @param indexedData defines the numeric data to be indexed
   * @param maxDuplicateInsertionIds defines the maximum number of insertion IDs that can be used,
   *        this is a best attempt and not a guarantee
   * @return a List of insertion ID's
   */
  public InsertionIds getInsertionIds(EntryRangeType indexedData, int maxEstimatedDuplicateIds);

  /**
   * Returns the range that the given ID represents
   *
   * @param partitionKey the partition key part of the insertion ID to determine a range for
   * @param sortKey the sort key part of the insertion ID to determine a range for
   * @return the range that the given insertion ID represents, inclusive on the start and exclusive
   *         on the end for the range
   */
  public EntryRangeType getRangeForId(byte[] partitionKey, byte[] sortKey);
}
