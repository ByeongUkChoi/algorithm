defmodule Solution do
  @spec length_of_longest_substring(s :: String.t) :: integer
  def length_of_longest_substring(s) do
    char_list = String.codepoints(s)
    get_longest_length(char_list, 0)
  end

  defp get_longest_length([], max) do
    max
  end

  defp get_longest_length([_ | tail] = char_list, max) do
    long_length = get_substring_size(char_list, MapSet.new(), 0)
    if long_length > max do
      get_longest_length(tail, long_length)
    else
      get_longest_length(tail, max)
    end
  end

  defp get_substring_size([], _alpabets, size) do
    size
  end

  defp get_substring_size([head | tail] = char_list, alpabets, size) do
    if MapSet.member?(alpabets, head) do
      size
    else
      get_substring_size(tail, MapSet.put(alpabets, head), size + 1)
    end
  end
end
