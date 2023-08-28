defmodule Solution do
  @spec three_sum(nums :: [integer]) :: [[integer]]
  def three_sum(nums) do
    nums = nums |> reduce_duplicates() |> Enum.sort()
    num_length = length(nums)

    0..(num_length - 1)
    |> Enum.flat_map(fn i ->
      {num, list} = List.pop_at(nums, i)
      num_map = list_to_index_map(list)

      find_sum(num_map, num, 0, num_length - 2)
    end)
    |> Enum.uniq()
  end

  defp reduce_duplicates(lst, max_duplicates \\ 3) do
    lst
    |> Enum.reduce(%{}, fn x, acc ->
      Map.update(acc, x, 1, &(&1 + 1))
    end)
    |> Enum.reduce(lst, fn
      {k, v}, acc when v > max_duplicates -> delete_first_n(acc, k, v - max_duplicates)
      {_k, _v}, acc -> acc
    end)
  end

  defp delete_first_n(lst, _val, 0), do: lst

  defp delete_first_n(lst, val, n) do
    lst
    |> List.delete(val)
    |> delete_first_n(val, n - 1)
  end

  defp list_to_index_map(list) do
    list |> Enum.with_index() |> Map.new(fn {v, i} -> {i, v} end)
  end

  defp find_sum(num_map, visit, left, right, acc \\ [])

  defp find_sum(_num_map, _visit, left, right, acc) when left >= right do
    acc
  end

  defp find_sum(num_map, visit, left, right, acc) do
    left_val = num_map[left]
    right_val = num_map[right]

    cond do
      left_val + right_val + visit == 0 ->
        find_sum(num_map, visit, left + 1, right - 1, [
          Enum.sort([left_val, right_val, visit]) | acc
        ])

      left_val + right_val + visit < 0 ->
        find_sum(num_map, visit, left + 1, right, acc)

      left_val + right_val + visit > 0 ->
        find_sum(num_map, visit, left, right - 1, acc)
    end
  end
end
