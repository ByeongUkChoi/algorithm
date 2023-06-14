defmodule Solution do
  @spec search_insert(nums :: [integer], target :: integer) :: integer
  def search_insert([h | _], target) when h >= target, do: 0

  def search_insert(nums, target) do
    nums_tuple = List.to_tuple(nums)
    search(nums_tuple, target)
  end

  @spec search(tuple, integer) :: integer
  def search(numbers, key), do: search(numbers, key, 0, tuple_size(numbers) - 1)
  def search(numbers, key, 0, 1) when elem(numbers, 0) == key, do: 0

  def search(numbers, key, min, max) when div(max - min, 2) == 0 and elem(numbers, max) == key,
    do: max

  def search(numbers, key, min, max) do
    middle = div(max - min, 2) + min
    value = elem(numbers, middle)

    cond do
      value == key ->
        middle

      middle == max or middle == min ->
        if elem(numbers, max) < key do
          max + 1
        else
          max
        end

      value < key ->
        search(numbers, key, middle, max)

      value > key ->
        search(numbers, key, min, middle)
    end
  end
end
